package io.burkard.cdk.services.opsworks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLayerProps {

  def apply(
    name: String,
    autoAssignPublicIps: Boolean,
    `type`: String,
    autoAssignElasticIps: Boolean,
    shortname: String,
    enableAutoHealing: Boolean,
    stackId: String,
    installUpdatesOnBoot: Option[Boolean] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    customRecipes: Option[software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty] = None,
    customInstanceProfileArn: Option[String] = None,
    volumeConfigurations: Option[List[_]] = None,
    attributes: Option[Map[String, String]] = None,
    customJson: Option[AnyRef] = None,
    useEbsOptimizedInstances: Option[Boolean] = None,
    lifecycleEventConfiguration: Option[software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty] = None,
    packages: Option[List[String]] = None,
    customSecurityGroupIds: Option[List[String]] = None,
    loadBasedAutoScaling: Option[software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty] = None
  ): software.amazon.awscdk.services.opsworks.CfnLayerProps =
    (new software.amazon.awscdk.services.opsworks.CfnLayerProps.Builder)
      .name(name)
      .autoAssignPublicIps(autoAssignPublicIps)
      .`type`(`type`)
      .autoAssignElasticIps(autoAssignElasticIps)
      .shortname(shortname)
      .enableAutoHealing(enableAutoHealing)
      .stackId(stackId)
      .installUpdatesOnBoot(installUpdatesOnBoot.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.map(_.asJava).orNull)
      .customRecipes(customRecipes.orNull)
      .customInstanceProfileArn(customInstanceProfileArn.orNull)
      .volumeConfigurations(volumeConfigurations.map(_.asJava).orNull)
      .attributes(attributes.map(_.asJava).orNull)
      .customJson(customJson.orNull)
      .useEbsOptimizedInstances(useEbsOptimizedInstances.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .lifecycleEventConfiguration(lifecycleEventConfiguration.orNull)
      .packages(packages.map(_.asJava).orNull)
      .customSecurityGroupIds(customSecurityGroupIds.map(_.asJava).orNull)
      .loadBasedAutoScaling(loadBasedAutoScaling.orNull)
      .build()
}
