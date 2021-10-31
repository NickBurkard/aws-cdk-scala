package io.burkard.cdk.services.ecs

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ExecuteCommandConfiguration {

  def apply(
    logging: Option[software.amazon.awscdk.services.ecs.ExecuteCommandLogging] = None,
    kmsKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    logConfiguration: Option[software.amazon.awscdk.services.ecs.ExecuteCommandLogConfiguration] = None
  ): software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration =
    (new software.amazon.awscdk.services.ecs.ExecuteCommandConfiguration.Builder)
      .logging(logging.orNull)
      .kmsKey(kmsKey.orNull)
      .logConfiguration(logConfiguration.orNull)
      .build()
}
