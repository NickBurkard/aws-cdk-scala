package io.burkard.cdk.services.s3outposts

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnBucketProps {

  def apply(
    outpostId: String,
    bucketName: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    lifecycleConfiguration: Option[software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty] = None
  ): software.amazon.awscdk.services.s3outposts.CfnBucketProps =
    (new software.amazon.awscdk.services.s3outposts.CfnBucketProps.Builder)
      .outpostId(outpostId)
      .bucketName(bucketName)
      .tags(tags.map(_.asJava).orNull)
      .lifecycleConfiguration(lifecycleConfiguration.orNull)
      .build()
}
