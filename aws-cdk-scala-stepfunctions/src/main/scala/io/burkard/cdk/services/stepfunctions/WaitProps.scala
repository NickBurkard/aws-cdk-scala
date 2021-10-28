package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object WaitProps {

  def apply(
    comment: Option[String] = None,
    time: Option[software.amazon.awscdk.services.stepfunctions.WaitTime] = None
  ): software.amazon.awscdk.services.stepfunctions.WaitProps =
    (new software.amazon.awscdk.services.stepfunctions.WaitProps.Builder)
      .comment(comment.orNull)
      .time(time.orNull)
      .build()
}
