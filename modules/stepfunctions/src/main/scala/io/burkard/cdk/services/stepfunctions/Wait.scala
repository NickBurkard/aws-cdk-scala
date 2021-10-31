package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Wait {

  def apply(
    internalResourceId: String,
    comment: Option[String] = None,
    time: Option[software.amazon.awscdk.services.stepfunctions.WaitTime] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.Wait =
    software.amazon.awscdk.services.stepfunctions.Wait.Builder
      .create(stackCtx, internalResourceId)
      .comment(comment.orNull)
      .time(time.orNull)
      .build()
}
