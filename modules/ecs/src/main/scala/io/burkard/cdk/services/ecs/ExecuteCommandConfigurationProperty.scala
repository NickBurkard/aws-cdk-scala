package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExecuteCommandConfigurationProperty {

  def apply(
    logging: Option[String] = None,
    logConfiguration: Option[software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandLogConfigurationProperty] = None,
    kmsKeyId: Option[String] = None
  ): software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty =
    (new software.amazon.awscdk.services.ecs.CfnCluster.ExecuteCommandConfigurationProperty.Builder)
      .logging(logging.orNull)
      .logConfiguration(logConfiguration.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .build()
}
