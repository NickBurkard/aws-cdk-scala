package io.burkard.cdk.core

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DefaultStackSynthesizerProps {

  def apply(
    qualifier: Option[String] = None,
    imageAssetPublishingRoleArn: Option[String] = None,
    dockerTagPrefix: Option[String] = None,
    fileAssetPublishingExternalId: Option[String] = None,
    cloudFormationExecutionRole: Option[String] = None,
    deployRoleExternalId: Option[String] = None,
    lookupRoleArn: Option[String] = None,
    generateBootstrapVersionRule: Option[Boolean] = None,
    imageAssetPublishingExternalId: Option[String] = None,
    fileAssetKeyArnExportName: Option[String] = None,
    fileAssetPublishingRoleArn: Option[String] = None,
    bucketPrefix: Option[String] = None,
    imageAssetsRepositoryName: Option[String] = None,
    fileAssetsBucketName: Option[String] = None,
    deployRoleArn: Option[String] = None,
    bootstrapStackVersionSsmParameter: Option[String] = None
  ): software.amazon.awscdk.DefaultStackSynthesizerProps =
    (new software.amazon.awscdk.DefaultStackSynthesizerProps.Builder)
      .qualifier(qualifier.orNull)
      .imageAssetPublishingRoleArn(imageAssetPublishingRoleArn.orNull)
      .dockerTagPrefix(dockerTagPrefix.orNull)
      .fileAssetPublishingExternalId(fileAssetPublishingExternalId.orNull)
      .cloudFormationExecutionRole(cloudFormationExecutionRole.orNull)
      .deployRoleExternalId(deployRoleExternalId.orNull)
      .lookupRoleArn(lookupRoleArn.orNull)
      .generateBootstrapVersionRule(generateBootstrapVersionRule.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .imageAssetPublishingExternalId(imageAssetPublishingExternalId.orNull)
      .fileAssetKeyArnExportName(fileAssetKeyArnExportName.orNull)
      .fileAssetPublishingRoleArn(fileAssetPublishingRoleArn.orNull)
      .bucketPrefix(bucketPrefix.orNull)
      .imageAssetsRepositoryName(imageAssetsRepositoryName.orNull)
      .fileAssetsBucketName(fileAssetsBucketName.orNull)
      .deployRoleArn(deployRoleArn.orNull)
      .bootstrapStackVersionSsmParameter(bootstrapStackVersionSsmParameter.orNull)
      .build()
}
