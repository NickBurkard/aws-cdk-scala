package io.burkard.cdk.services.dlm

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ScheduleProperty {

  def apply(
    retainRule: Option[software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.RetainRuleProperty] = None,
    fastRestoreRule: Option[software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.FastRestoreRuleProperty] = None,
    deprecateRule: Option[software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.DeprecateRuleProperty] = None,
    shareRules: Option[List[_]] = None,
    variableTags: Option[List[_]] = None,
    createRule: Option[software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.CreateRuleProperty] = None,
    name: Option[String] = None,
    copyTags: Option[Boolean] = None,
    crossRegionCopyRules: Option[List[_]] = None,
    tagsToAdd: Option[List[_]] = None
  ): software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty =
    (new software.amazon.awscdk.services.dlm.CfnLifecyclePolicy.ScheduleProperty.Builder)
      .retainRule(retainRule.orNull)
      .fastRestoreRule(fastRestoreRule.orNull)
      .deprecateRule(deprecateRule.orNull)
      .shareRules(shareRules.map(_.asJava).orNull)
      .variableTags(variableTags.map(_.asJava).orNull)
      .createRule(createRule.orNull)
      .name(name.orNull)
      .copyTags(copyTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .crossRegionCopyRules(crossRegionCopyRules.map(_.asJava).orNull)
      .tagsToAdd(tagsToAdd.map(_.asJava).orNull)
      .build()
}
