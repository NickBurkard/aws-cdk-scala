package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Fail {

  def apply(
    internalResourceId: String,
    error: Option[String] = None,
    comment: Option[String] = None,
    cause: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.Fail =
    software.amazon.awscdk.services.stepfunctions.Fail.Builder
      .create(stackCtx, internalResourceId)
      .error(error.orNull)
      .comment(comment.orNull)
      .cause(cause.orNull)
      .build()
}
