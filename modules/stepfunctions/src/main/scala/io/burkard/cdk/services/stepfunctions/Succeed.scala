package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Succeed {

  def apply(
    internalResourceId: String,
    inputPath: Option[String] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.Succeed =
    software.amazon.awscdk.services.stepfunctions.Succeed.Builder
      .create(stackCtx, internalResourceId)
      .inputPath(inputPath.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .build()
}
