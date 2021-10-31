package io.burkard.cdk.services.opsworks

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLayer {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    installUpdatesOnBoot: Option[Boolean] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    customRecipes: Option[software.amazon.awscdk.services.opsworks.CfnLayer.RecipesProperty] = None,
    customInstanceProfileArn: Option[String] = None,
    volumeConfigurations: Option[List[_]] = None,
    attributes: Option[Map[String, String]] = None,
    customJson: Option[AnyRef] = None,
    useEbsOptimizedInstances: Option[Boolean] = None,
    lifecycleEventConfiguration: Option[software.amazon.awscdk.services.opsworks.CfnLayer.LifecycleEventConfigurationProperty] = None,
    autoAssignPublicIps: Option[Boolean] = None,
    `type`: Option[String] = None,
    packages: Option[List[String]] = None,
    customSecurityGroupIds: Option[List[String]] = None,
    autoAssignElasticIps: Option[Boolean] = None,
    shortname: Option[String] = None,
    loadBasedAutoScaling: Option[software.amazon.awscdk.services.opsworks.CfnLayer.LoadBasedAutoScalingProperty] = None,
    enableAutoHealing: Option[Boolean] = None,
    stackId: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.opsworks.CfnLayer =
    software.amazon.awscdk.services.opsworks.CfnLayer.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .installUpdatesOnBoot(installUpdatesOnBoot.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .tags(tags.map(_.asJava).orNull)
      .customRecipes(customRecipes.orNull)
      .customInstanceProfileArn(customInstanceProfileArn.orNull)
      .volumeConfigurations(volumeConfigurations.map(_.asJava).orNull)
      .attributes(attributes.map(_.asJava).orNull)
      .customJson(customJson.orNull)
      .useEbsOptimizedInstances(useEbsOptimizedInstances.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .lifecycleEventConfiguration(lifecycleEventConfiguration.orNull)
      .autoAssignPublicIps(autoAssignPublicIps.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .`type`(`type`.orNull)
      .packages(packages.map(_.asJava).orNull)
      .customSecurityGroupIds(customSecurityGroupIds.map(_.asJava).orNull)
      .autoAssignElasticIps(autoAssignElasticIps.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .shortname(shortname.orNull)
      .loadBasedAutoScaling(loadBasedAutoScaling.orNull)
      .enableAutoHealing(enableAutoHealing.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .stackId(stackId.orNull)
      .build()
}
