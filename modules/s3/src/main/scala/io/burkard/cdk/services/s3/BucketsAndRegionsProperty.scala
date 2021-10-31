package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object BucketsAndRegionsProperty {

  def apply(
    regions: Option[List[String]] = None,
    buckets: Option[List[String]] = None
  ): software.amazon.awscdk.services.s3.CfnStorageLens.BucketsAndRegionsProperty =
    (new software.amazon.awscdk.services.s3.CfnStorageLens.BucketsAndRegionsProperty.Builder)
      .regions(regions.map(_.asJava).orNull)
      .buckets(buckets.map(_.asJava).orNull)
      .build()
}
