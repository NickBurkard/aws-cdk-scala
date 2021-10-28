package io.burkard.cdk.services.ecr

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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
