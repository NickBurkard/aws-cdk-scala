package io.burkard.cdk

package object core {
  // Safely discard non-unit values.
  private[cdk] object ValueDiscard {
    def apply[A](a: => A): Unit = {
      val _ = a
      ()
    }
  }
}
