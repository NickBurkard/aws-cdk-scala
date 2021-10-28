package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTypeActivationProps {

  def apply(
    publisherId: Option[String] = None,
    versionBump: Option[String] = None,
    autoUpdate: Option[Boolean] = None,
    majorVersion: Option[String] = None,
    typeName: Option[String] = None,
    typeNameAlias: Option[String] = None,
    executionRoleArn: Option[String] = None,
    loggingConfig: Option[software.amazon.awscdk.CfnTypeActivation.LoggingConfigProperty] = None,
    `type`: Option[String] = None,
    publicTypeArn: Option[String] = None
  ): software.amazon.awscdk.CfnTypeActivationProps =
    (new software.amazon.awscdk.CfnTypeActivationProps.Builder)
      .publisherId(publisherId.orNull)
      .versionBump(versionBump.orNull)
      .autoUpdate(autoUpdate.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .majorVersion(majorVersion.orNull)
      .typeName(typeName.orNull)
      .typeNameAlias(typeNameAlias.orNull)
      .executionRoleArn(executionRoleArn.orNull)
      .loggingConfig(loggingConfig.orNull)
      .`type`(`type`.orNull)
      .publicTypeArn(publicTypeArn.orNull)
      .build()
}
