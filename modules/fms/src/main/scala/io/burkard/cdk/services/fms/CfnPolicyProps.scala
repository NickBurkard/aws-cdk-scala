package io.burkard.cdk.services.fms

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnPolicyProps {

  def apply(
    remediationEnabled: Boolean,
    policyName: String,
    excludeResourceTags: Boolean,
    resourceType: String,
    securityServicePolicyData: AnyRef,
    excludeMap: Option[software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty] = None,
    resourcesCleanUp: Option[Boolean] = None,
    deleteAllPolicyResources: Option[Boolean] = None,
    resourceTypeList: Option[List[String]] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty]] = None,
    includeMap: Option[software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty] = None,
    resourceTags: Option[List[_]] = None
  ): software.amazon.awscdk.services.fms.CfnPolicyProps =
    (new software.amazon.awscdk.services.fms.CfnPolicyProps.Builder)
      .remediationEnabled(remediationEnabled)
      .policyName(policyName)
      .excludeResourceTags(excludeResourceTags)
      .resourceType(resourceType)
      .securityServicePolicyData(securityServicePolicyData)
      .excludeMap(excludeMap.orNull)
      .resourcesCleanUp(resourcesCleanUp.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deleteAllPolicyResources(deleteAllPolicyResources.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resourceTypeList(resourceTypeList.map(_.asJava).orNull)
      .tags(tags.map(_.asJava).orNull)
      .includeMap(includeMap.orNull)
      .resourceTags(resourceTags.map(_.asJava).orNull)
      .build()
}
