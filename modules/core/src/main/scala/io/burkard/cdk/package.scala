package io.burkard

package object cdk {
  // Safely discard non-unit values.
  private[cdk] object ValueDiscard {
    def apply[A](a: => A): Unit = {
      val _ = a
      ()
    }
  }
}
