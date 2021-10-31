package io.burkard.cdk.services.qldb

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object KinesisConfigurationProperty {

  def apply(
    streamArn: Option[String] = None,
    aggregationEnabled: Option[Boolean] = None
  ): software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty =
    (new software.amazon.awscdk.services.qldb.CfnStream.KinesisConfigurationProperty.Builder)
      .streamArn(streamArn.orNull)
      .aggregationEnabled(aggregationEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
