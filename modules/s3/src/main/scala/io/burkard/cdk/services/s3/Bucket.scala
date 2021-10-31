package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object Bucket {

  def apply(
    internalResourceId: String,
    websiteIndexDocument: Option[String] = None,
    lifecycleRules: Option[List[_ <: software.amazon.awscdk.services.s3.LifecycleRule]] = None,
    accessControl: Option[software.amazon.awscdk.services.s3.BucketAccessControl] = None,
    serverAccessLogsPrefix: Option[String] = None,
    cors: Option[List[_ <: software.amazon.awscdk.services.s3.CorsRule]] = None,
    serverAccessLogsBucket: Option[software.amazon.awscdk.services.s3.IBucket] = None,
    metrics: Option[List[_ <: software.amazon.awscdk.services.s3.BucketMetrics]] = None,
    removalPolicy: Option[software.amazon.awscdk.RemovalPolicy] = None,
    enforceSsl: Option[Boolean] = None,
    inventories: Option[List[_ <: software.amazon.awscdk.services.s3.Inventory]] = None,
    bucketKeyEnabled: Option[Boolean] = None,
    encryption: Option[software.amazon.awscdk.services.s3.BucketEncryption] = None,
    autoDeleteObjects: Option[Boolean] = None,
    blockPublicAccess: Option[software.amazon.awscdk.services.s3.BlockPublicAccess] = None,
    objectOwnership: Option[software.amazon.awscdk.services.s3.ObjectOwnership] = None,
    websiteRedirect: Option[software.amazon.awscdk.services.s3.RedirectTarget] = None,
    publicReadAccess: Option[Boolean] = None,
    websiteErrorDocument: Option[String] = None,
    encryptionKey: Option[software.amazon.awscdk.services.kms.IKey] = None,
    bucketName: Option[String] = None,
    websiteRoutingRules: Option[List[_ <: software.amazon.awscdk.services.s3.RoutingRule]] = None,
    versioned: Option[Boolean] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3.Bucket =
    software.amazon.awscdk.services.s3.Bucket.Builder
      .create(stackCtx, internalResourceId)
      .websiteIndexDocument(websiteIndexDocument.orNull)
      .lifecycleRules(lifecycleRules.map(_.asJava).orNull)
      .accessControl(accessControl.orNull)
      .serverAccessLogsPrefix(serverAccessLogsPrefix.orNull)
      .cors(cors.map(_.asJava).orNull)
      .serverAccessLogsBucket(serverAccessLogsBucket.orNull)
      .metrics(metrics.map(_.asJava).orNull)
      .removalPolicy(removalPolicy.orNull)
      .enforceSsl(enforceSsl.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .inventories(inventories.map(_.asJava).orNull)
      .bucketKeyEnabled(bucketKeyEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .encryption(encryption.orNull)
      .autoDeleteObjects(autoDeleteObjects.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .blockPublicAccess(blockPublicAccess.orNull)
      .objectOwnership(objectOwnership.orNull)
      .websiteRedirect(websiteRedirect.orNull)
      .publicReadAccess(publicReadAccess.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .websiteErrorDocument(websiteErrorDocument.orNull)
      .encryptionKey(encryptionKey.orNull)
      .bucketName(bucketName.orNull)
      .websiteRoutingRules(websiteRoutingRules.map(_.asJava).orNull)
      .versioned(versioned.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
