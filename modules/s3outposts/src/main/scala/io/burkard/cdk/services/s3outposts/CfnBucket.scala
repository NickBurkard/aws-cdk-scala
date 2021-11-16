package io.burkard.cdk.services.s3outposts

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBucket {

  def apply(
    internalResourceId: String,
    outpostId: String,
    bucketName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    lifecycleConfiguration: Option[software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.s3outposts.CfnBucket =
    software.amazon.awscdk.services.s3outposts.CfnBucket.Builder
      .create(stackCtx, internalResourceId)
      .outpostId(outpostId)
      .bucketName(bucketName)
      .tags(tags.map(_.asJava).orNull)
      .lifecycleConfiguration(lifecycleConfiguration.orNull)
      .build()
}
