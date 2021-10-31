package io.burkard.cdk.services.ecr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnRepository {

  def apply(
    internalResourceId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    lifecyclePolicy: Option[software.amazon.awscdk.services.ecr.CfnRepository.LifecyclePolicyProperty] = None,
    imageTagMutability: Option[String] = None,
    repositoryPolicyText: Option[AnyRef] = None,
    imageScanningConfiguration: Option[software.amazon.awscdk.services.ecr.CfnRepository.ImageScanningConfigurationProperty] = None,
    repositoryName: Option[String] = None,
    encryptionConfiguration: Option[software.amazon.awscdk.services.ecr.CfnRepository.EncryptionConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ecr.CfnRepository =
    software.amazon.awscdk.services.ecr.CfnRepository.Builder
      .create(stackCtx, internalResourceId)
      .tags(tags.map(_.asJava).orNull)
      .lifecyclePolicy(lifecyclePolicy.orNull)
      .imageTagMutability(imageTagMutability.orNull)
      .repositoryPolicyText(repositoryPolicyText.orNull)
      .imageScanningConfiguration(imageScanningConfiguration.orNull)
      .repositoryName(repositoryName.orNull)
      .encryptionConfiguration(encryptionConfiguration.orNull)
      .build()
}
