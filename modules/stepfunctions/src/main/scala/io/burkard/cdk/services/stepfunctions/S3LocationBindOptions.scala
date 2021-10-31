package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object S3LocationBindOptions {

  def apply(
    forReading: Option[Boolean] = None,
    forWriting: Option[Boolean] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions =
    (new software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions.Builder)
      .forReading(forReading.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .forWriting(forWriting.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
