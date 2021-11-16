package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ResourceConfig {

  def apply(
    instanceType: software.amazon.awscdk.services.ec2.InstanceType,
    instanceCount: Number,
    volumeSize: software.amazon.awscdk.Size,
    volumeEncryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig =
    (new software.amazon.awscdk.services.stepfunctions.tasks.ResourceConfig.Builder)
      .instanceType(instanceType)
      .instanceCount(instanceCount)
      .volumeSize(volumeSize)
      .volumeEncryptionKey(volumeEncryptionKey.orNull)
      .build()
}
