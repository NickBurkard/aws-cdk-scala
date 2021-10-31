package io.burkard.cdk.services.ecr

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object LifecycleRule {

  def apply(
    tagStatus: Option[software.amazon.awscdk.services.ecr.TagStatus] = None,
    rulePriority: Option[Number] = None,
    tagPrefixList: Option[List[String]] = None,
    description: Option[String] = None,
    maxImageAge: Option[software.amazon.awscdk.Duration] = None,
    maxImageCount: Option[Number] = None
  ): software.amazon.awscdk.services.ecr.LifecycleRule =
    (new software.amazon.awscdk.services.ecr.LifecycleRule.Builder)
      .tagStatus(tagStatus.orNull)
      .rulePriority(rulePriority.orNull)
      .tagPrefixList(tagPrefixList.map(_.asJava).orNull)
      .description(description.orNull)
      .maxImageAge(maxImageAge.orNull)
      .maxImageCount(maxImageCount.orNull)
      .build()
}
