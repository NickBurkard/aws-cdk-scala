package io.burkard.cdk.services.ec2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object AmazonLinuxImage {

  def apply(
    virtualization: Option[software.amazon.awscdk.services.ec2.AmazonLinuxVirt] = None,
    cachedInContext: Option[Boolean] = None,
    generation: Option[software.amazon.awscdk.services.ec2.AmazonLinuxGeneration] = None,
    userData: Option[software.amazon.awscdk.services.ec2.UserData] = None,
    edition: Option[software.amazon.awscdk.services.ec2.AmazonLinuxEdition] = None,
    cpuType: Option[software.amazon.awscdk.services.ec2.AmazonLinuxCpuType] = None,
    storage: Option[software.amazon.awscdk.services.ec2.AmazonLinuxStorage] = None
  ): software.amazon.awscdk.services.ec2.AmazonLinuxImage =
    software.amazon.awscdk.services.ec2.AmazonLinuxImage.Builder
      .create()
      .virtualization(virtualization.orNull)
      .cachedInContext(cachedInContext.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .generation(generation.orNull)
      .userData(userData.orNull)
      .edition(edition.orNull)
      .cpuType(cpuType.orNull)
      .storage(storage.orNull)
      .build()
}
