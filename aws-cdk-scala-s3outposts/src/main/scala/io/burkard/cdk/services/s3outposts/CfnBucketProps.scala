package io.burkard.cdk.services.s3outposts

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnBucketProps {

  def apply(
    outpostId: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    lifecycleConfiguration: Option[software.amazon.awscdk.services.s3outposts.CfnBucket.LifecycleConfigurationProperty] = None,
    bucketName: Option[String] = None
  ): software.amazon.awscdk.services.s3outposts.CfnBucketProps =
    (new software.amazon.awscdk.services.s3outposts.CfnBucketProps.Builder)
      .outpostId(outpostId.orNull)
      .tags(tags.map(_.asJava).orNull)
      .lifecycleConfiguration(lifecycleConfiguration.orNull)
      .bucketName(bucketName.orNull)
      .build()
}
