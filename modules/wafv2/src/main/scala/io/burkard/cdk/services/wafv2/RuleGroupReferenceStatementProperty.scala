package io.burkard.cdk.services.wafv2

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object RuleGroupReferenceStatementProperty {

  def apply(
    arn: Option[String] = None,
    excludedRules: Option[List[_]] = None
  ): software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty =
    (new software.amazon.awscdk.services.wafv2.CfnWebACL.RuleGroupReferenceStatementProperty.Builder)
      .arn(arn.orNull)
      .excludedRules(excludedRules.map(_.asJava).orNull)
      .build()
}
