package io.burkard.cdk.services.rds

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ProcessorFeatures {

  def apply(
    threadsPerCore: Option[Number] = None,
    coreCount: Option[Number] = None
  ): software.amazon.awscdk.services.rds.ProcessorFeatures =
    (new software.amazon.awscdk.services.rds.ProcessorFeatures.Builder)
      .threadsPerCore(threadsPerCore.orNull)
      .coreCount(coreCount.orNull)
      .build()
}
