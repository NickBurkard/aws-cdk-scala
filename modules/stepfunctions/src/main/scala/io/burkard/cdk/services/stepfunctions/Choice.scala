package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Choice {

  def apply(
    internalResourceId: String,
    inputPath: Option[String] = None,
    outputPath: Option[String] = None,
    comment: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.stepfunctions.Choice =
    software.amazon.awscdk.services.stepfunctions.Choice.Builder
      .create(stackCtx, internalResourceId)
      .inputPath(inputPath.orNull)
      .outputPath(outputPath.orNull)
      .comment(comment.orNull)
      .build()
}
