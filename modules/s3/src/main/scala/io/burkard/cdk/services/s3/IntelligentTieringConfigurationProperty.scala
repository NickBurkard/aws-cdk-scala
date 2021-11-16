package io.burkard.cdk.services.s3

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object IntelligentTieringConfigurationProperty {

  def apply(
    tierings: List[_],
    id: String,
    status: String,
    tagFilters: Option[List[_]] = None,
    prefix: Option[String] = None
  ): software.amazon.awscdk.services.s3.CfnBucket.IntelligentTieringConfigurationProperty =
    (new software.amazon.awscdk.services.s3.CfnBucket.IntelligentTieringConfigurationProperty.Builder)
      .tierings(tierings.asJava)
      .id(id)
      .status(status)
      .tagFilters(tagFilters.map(_.asJava).orNull)
      .prefix(prefix.orNull)
      .build()
}
