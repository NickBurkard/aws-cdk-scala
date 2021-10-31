package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TransformS3DataSource {

  def apply(
    s3DataType: Option[software.amazon.awscdk.services.stepfunctions.tasks.S3DataType] = None,
    s3Uri: Option[String] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource =
    (new software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource.Builder)
      .s3DataType(s3DataType.orNull)
      .s3Uri(s3Uri.orNull)
      .build()
}
