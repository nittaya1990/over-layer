//
//  Hooks.scala
//  over-layer
//
//  Created by d-exclaimation on 4:36 PM.
//

package io.github.dexclaimation.overlayer.model

import akka.Done
import akka.http.scaladsl.model.ws.Message

import scala.util.Try

object Hooks {
  /** Initial Connection Event Hook */
  type InitHook = Unit

  /** On Websocket Message Event Hook */
  type MessageHook = Message => Unit

  /** End Connection Event Hook */
  type EndHook = Try[Done] => Unit
}