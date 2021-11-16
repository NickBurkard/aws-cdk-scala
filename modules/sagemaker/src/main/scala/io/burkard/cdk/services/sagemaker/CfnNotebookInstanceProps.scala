package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNotebookInstanceProps {

  def apply(
    instanceType: String,
    roleArn: String,
    defaultCodeRepository: Option[String] = None,
    acceleratorTypes: Option[List[String]] = None,
    securityGroupIds: Option[List[String]] = None,
    subnetId: Option[String] = None,
    platformIdentifier: Option[String] = None,
    lifecycleConfigName: Option[String] = None,
    rootAccess: Option[String] = None,
    directInternetAccess: Option[String] = None,
    kmsKeyId: Option[String] = None,
    notebookInstanceName: Option[String] = None,
    additionalCodeRepositories: Option[List[String]] = None,
    volumeSizeInGb: Option[Number] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps =
    (new software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceProps.Builder)
      .instanceType(instanceType)
      .roleArn(roleArn)
      .defaultCodeRepository(defaultCodeRepository.orNull)
      .acceleratorTypes(acceleratorTypes.map(_.asJava).orNull)
      .securityGroupIds(securityGroupIds.map(_.asJava).orNull)
      .subnetId(subnetId.orNull)
      .platformIdentifier(platformIdentifier.orNull)
      .lifecycleConfigName(lifecycleConfigName.orNull)
      .rootAccess(rootAccess.orNull)
      .directInternetAccess(directInternetAccess.orNull)
      .kmsKeyId(kmsKeyId.orNull)
      .notebookInstanceName(notebookInstanceName.orNull)
      .additionalCodeRepositories(additionalCodeRepositories.map(_.asJava).orNull)
      .volumeSizeInGb(volumeSizeInGb.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}
