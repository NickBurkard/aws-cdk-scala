package io.burkard.cdk.services.s3

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BucketDeploymentProps {

  def apply(
    retainOnDelete: Option[Boolean] = None,
    contentLanguage: Option[String] = None,
    serverSideEncryptionAwsKmsKeyId: Option[String] = None,
    accessControl: Option[software.amazon.awscdk.services.s3.BucketAccessControl] = None,
    websiteRedirectLocation: Option[String] = None,
    storageClass: Option[software.amazon.awscdk.services.s3.deployment.StorageClass] = None,
    vpcSubnets: Option[software.amazon.awscdk.services.ec2.SubnetSelection] = None,
    contentType: Option[String] = None,
    contentDisposition: Option[String] = None,
    sources: Option[List[_ <: software.amazon.awscdk.services.s3.deployment.ISource]] = None,
    serverSideEncryption: Option[software.amazon.awscdk.services.s3.deployment.ServerSideEncryption] = None,
    expires: Option[software.amazon.awscdk.Expiration] = None,
    cacheControl: Option[List[_ <: software.amazon.awscdk.services.s3.deployment.CacheControl]] = None,
    memoryLimit: Option[Number] = None,
    destinationBucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    role: Option[software.amazon.awscdk.services.iam.IRole] = None,
    useEfs: Option[Boolean] = None,
    distribution: Option[software.amazon.awscdk.services.cloudfront.IDistribution] = None,
    distributionPaths: Option[List[String]] = None,
    prune: Option[Boolean] = None,
    include: Option[List[String]] = None,
    metadata: Option[software.amazon.awscdk.services.s3.deployment.UserDefinedObjectMetadata] = None,
    contentEncoding: Option[String] = None,
    exclude: Option[List[String]] = None,
    vpc: Option[software.amazon.awscdk.services.ec2.IVpc] = None,
    serverSideEncryptionCustomerAlgorithm: Option[String] = None,
    destinationKeyPrefix: Option[String] = None
  ): software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps =
    (new software.amazon.awscdk.services.s3.deployment.BucketDeploymentProps.Builder)
      .retainOnDelete(retainOnDelete.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .contentLanguage(contentLanguage.orNull)
      .serverSideEncryptionAwsKmsKeyId(serverSideEncryptionAwsKmsKeyId.orNull)
      .accessControl(accessControl.orNull)
      .websiteRedirectLocation(websiteRedirectLocation.orNull)
      .storageClass(storageClass.orNull)
      .vpcSubnets(vpcSubnets.orNull)
      .contentType(contentType.orNull)
      .contentDisposition(contentDisposition.orNull)
      .sources(sources.map(_.asJava).orNull)
      .serverSideEncryption(serverSideEncryption.orNull)
      .expires(expires.orNull)
      .cacheControl(cacheControl.map(_.asJava).orNull)
      .memoryLimit(memoryLimit.orNull)
      .destinationBucket(destinationBucket.orNull)
      .role(role.orNull)
      .useEfs(useEfs.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .distribution(distribution.orNull)
      .distributionPaths(distributionPaths.map(_.asJava).orNull)
      .prune(prune.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .include(include.map(_.asJava).orNull)
      .metadata(metadata.orNull)
      .contentEncoding(contentEncoding.orNull)
      .exclude(exclude.map(_.asJava).orNull)
      .vpc(vpc.orNull)
      .serverSideEncryptionCustomerAlgorithm(serverSideEncryptionCustomerAlgorithm.orNull)
      .destinationKeyPrefix(destinationKeyPrefix.orNull)
      .build()
}