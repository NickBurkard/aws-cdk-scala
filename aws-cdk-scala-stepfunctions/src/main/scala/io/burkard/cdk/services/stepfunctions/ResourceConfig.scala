package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceConfig {

  def apply(
    volumeEncryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    instanceType: Option[software.amazon.awscdk.services.ec2.InstanceType] = None,
    instanceCount: Option[Number] = None,
    volumeSize: Option[software.amazon.awscdk.Size] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig =
    (new software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig.Builder)
      .volumeEncryptionKey(volumeEncryptionKey.orNull)
      .instanceType(instanceType.orNull)
      .instanceCount(instanceCount.orNull)
      .volumeSize(volumeSize.orNull)
      .build()
}
