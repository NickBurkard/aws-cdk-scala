package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Wait {

  def apply(
    internalResourceId: String,
    time: software.amazon.awscdk.services.stepfunctions.WaitTime,
    comment: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.Wait =
    software.amazon.awscdk.services.stepfunctions.Wait.Builder
      .create(stackCtx, internalResourceId)
      .time(time)
      .comment(comment.orNull)
      .build()
}
