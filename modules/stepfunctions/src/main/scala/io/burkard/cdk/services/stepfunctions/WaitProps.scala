package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object WaitProps {

  def apply(
    time: software.amazon.awscdk.services.stepfunctions.WaitTime,
    comment: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.WaitProps =
    (new software.amazon.awscdk.services.stepfunctions.WaitProps.Builder)
      .time(time)
      .comment(comment.orNull)
      .build()
}
