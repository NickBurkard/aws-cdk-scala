package io.burkard.cdk.services.config

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScopeProperty {

  def apply(
    tagKey: Option[String] = None,
    complianceResourceId: Option[String] = None,
    complianceResourceTypes: Option[List[String]] = None,
    tagValue: Option[String] = None
  ): software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty =
    (new software.amazon.awscdk.services.config.CfnConfigRule.ScopeProperty.Builder)
      .tagKey(tagKey.orNull)
      .complianceResourceId(complianceResourceId.orNull)
      .complianceResourceTypes(complianceResourceTypes.map(_.asJava).orNull)
      .tagValue(tagValue.orNull)
      .build()
}
