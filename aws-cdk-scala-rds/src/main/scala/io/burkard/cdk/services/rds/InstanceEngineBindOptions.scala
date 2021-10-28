package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InstanceEngineBindOptions {

  def apply(
    s3ExportRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    s3ImportRole: Option[software.amazon.awscdk.services.iam.IRole] = None,
    optionGroup: Option[software.amazon.awscdk.services.rds.IOptionGroup] = None,
    domain: Option[String] = None,
    timezone: Option[String] = None
  ): software.amazon.awscdk.services.rds.InstanceEngineBindOptions =
    (new software.amazon.awscdk.services.rds.InstanceEngineBindOptions.Builder)
      .s3ExportRole(s3ExportRole.orNull)
      .s3ImportRole(s3ImportRole.orNull)
      .optionGroup(optionGroup.orNull)
      .domain(domain.orNull)
      .timezone(timezone.orNull)
      .build()
}
