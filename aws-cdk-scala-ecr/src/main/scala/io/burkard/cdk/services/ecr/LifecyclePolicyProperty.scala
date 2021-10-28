package io.burkard.cdk.services.ecr

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LifecyclePolicyProperty {

  def apply(
    lifecyclePolicyText: Option[String] = None,
    registryId: Option[String] = None
  ): software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty =
    (new software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty.Builder)
      .lifecyclePolicyText(lifecyclePolicyText.orNull)
      .registryId(registryId.orNull)
      .build()
}
