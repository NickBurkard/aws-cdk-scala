package io.burkard

package object cdk {
  type CdkApp = software.amazon.awscdk.App
  type CdkStack = software.amazon.awscdk.Stack

  // Safely discard non-unit values.
  object ValueDiscard {
    def apply[A](a: => A): Unit = {
      val _ = a
      ()
    }
  }
}
