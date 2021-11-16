package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object TransformResources {

  def apply(
    instanceType: software.amazon.awscdk.services.ec2.InstanceType,
    instanceCount: Number,
    volumeEncryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.TransformResources =
    (new software.amazon.awscdk.services.stepfunctions.tasks.TransformResources.Builder)
      .instanceType(instanceType)
      .instanceCount(instanceCount)
      .volumeEncryptionKey(volumeEncryptionKey.orNull)
      .build()
}
