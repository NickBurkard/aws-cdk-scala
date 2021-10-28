package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ClusterEngineBindOptions {

  def apply(
    s3ExportRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    s3ImportRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    parameterGroup: Option[software.amazon.awscdk.services.rds.IParameterGroup] = None
  ): software.amazon.awscdk.services.rds.ClusterEngineBindOptions =
    (new software.amazon.awscdk.services.rds.ClusterEngineBindOptions.Builder)
      .s3ExportRole(s3ExportRole.orNull)
      .s3ImportRole(s3ImportRole.orNull)
      .parameterGroup(parameterGroup.orNull)
      .build()
}
