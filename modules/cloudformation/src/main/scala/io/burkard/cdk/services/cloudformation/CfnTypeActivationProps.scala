package io.burkard.cdk.services.cloudformation

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnTypeActivationProps {

  def apply(
    publisherId: Option[String] = None,
    versionBump: Option[String] = None,
    autoUpdate: Option[Boolean] = None,
    majorVersion: Option[String] = None,
    typeName: Option[String] = None,
    typeNameAlias: Option[String] = None,
    executionRoleArn: Option[String] = None,
    loggingConfig: Option[software.amazon.awscdk.services.cloudformation.CfnTypeActivation.LoggingConfigProperty] = None,
    `type`: Option[String] = None,
    publicTypeArn: Option[String] = None
  ): software.amazon.awscdk.services.cloudformation.CfnTypeActivationProps =
    (new software.amazon.awscdk.services.cloudformation.CfnTypeActivationProps.Builder)
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
