package io.burkard.cdk.services.efs

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LifecyclePolicyProperty {

  def apply(
    transitionToIa: Option[String] = None,
    transitionToPrimaryStorageClass: Option[String] = None
  ): software.amazon.awscdk.services.efs.CfnFileSystem.LifecyclePolicyProperty =
    (new software.amazon.awscdk.services.efs.CfnFileSystem.LifecyclePolicyProperty.Builder)
      .transitionToIa(transitionToIa.orNull)
      .transitionToPrimaryStorageClass(transitionToPrimaryStorageClass.orNull)
      .build()
}
