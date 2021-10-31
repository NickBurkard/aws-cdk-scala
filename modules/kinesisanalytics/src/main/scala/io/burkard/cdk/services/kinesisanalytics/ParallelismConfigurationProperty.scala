package io.burkard.cdk.services.kinesisanalytics

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ParallelismConfigurationProperty {

  def apply(
    parallelism: Option[Number] = None,
    configurationType: Option[String] = None,
    autoScalingEnabled: Option[Boolean] = None,
    parallelismPerKpu: Option[Number] = None
  ): software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty =
    (new software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2.ParallelismConfigurationProperty.Builder)
      .parallelism(parallelism.orNull)
      .configurationType(configurationType.orNull)
      .autoScalingEnabled(autoScalingEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .parallelismPerKpu(parallelismPerKpu.orNull)
      .build()
}
