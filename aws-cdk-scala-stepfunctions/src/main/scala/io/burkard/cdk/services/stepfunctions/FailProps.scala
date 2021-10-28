package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FailProps {

  def apply(
    error: Option[String] = None,
    comment: Option[String] = None,
    cause: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.FailProps =
    (new software.amazon.awscdk.services.stepfunctions.FailProps.Builder)
      .error(error.orNull)
      .comment(comment.orNull)
      .cause(cause.orNull)
      .build()
}
