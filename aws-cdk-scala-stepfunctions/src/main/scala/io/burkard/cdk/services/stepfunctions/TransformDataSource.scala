package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TransformDataSource {

  def apply(
    s3DataSource: Option[software.amazon.awscdk.services.stepfunctions.tasks.TransformS3DataSource] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource =
    (new software.amazon.awscdk.services.stepfunctions.tasks.TransformDataSource.Builder)
      .s3DataSource(s3DataSource.orNull)
      .build()
}
