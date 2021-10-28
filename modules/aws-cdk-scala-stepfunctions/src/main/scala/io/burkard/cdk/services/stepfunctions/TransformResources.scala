package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object TransformResources {

  def apply(
    volumeEncryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    instanceType: Option[software.amazon.awscdk.services.ec2.InstanceType] = None,
    instanceCount: Option[Number] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.TransformResources =
    (new software.amazon.awscdk.services.stepfunctions.tasks.TransformResources.Builder)
      .volumeEncryptionKey(volumeEncryptionKey.orNull)
      .instanceType(instanceType.orNull)
      .instanceCount(instanceCount.orNull)
      .build()
}
