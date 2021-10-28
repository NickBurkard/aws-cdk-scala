package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DataSource {

  def apply(
    s3DataSource: Option[software.amazon.awscdk.services.stepfunctions.tasks.S3DataSource] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.DataSource =
    (new software.amazon.awscdk.services.stepfunctions.tasks.DataSource.Builder)
      .s3DataSource(s3DataSource.orNull)
      .build()
}