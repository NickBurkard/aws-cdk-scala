package io.burkard.cdk.services.fms

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnPolicyProps {

  def apply(
    remediationEnabled: Option[Boolean] = None,
    excludeMap: Option[software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty] = None,
    policyName: Option[String] = None,
    excludeResourceTags: Option[Boolean] = None,
    deleteAllPolicyResources: Option[Boolean] = None,
    resourceTypeList: Option[List[String]] = None,
    resourceType: Option[String] = None,
    securityServicePolicyData: Option[AnyRef] = None,
    tags: Option[List[_ <: software.amazon.awscdk.services.fms.CfnPolicy.PolicyTagProperty]] = None,
    includeMap: Option[software.amazon.awscdk.services.fms.CfnPolicy.IEMapProperty] = None,
    resourceTags: Option[List[_]] = None
  ): software.amazon.awscdk.services.fms.CfnPolicyProps =
    (new software.amazon.awscdk.services.fms.CfnPolicyProps.Builder)
      .remediationEnabled(remediationEnabled.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .excludeMap(excludeMap.orNull)
      .policyName(policyName.orNull)
      .excludeResourceTags(excludeResourceTags.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .deleteAllPolicyResources(deleteAllPolicyResources.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .resourceTypeList(resourceTypeList.map(_.asJava).orNull)
      .resourceType(resourceType.orNull)
      .securityServicePolicyData(securityServicePolicyData.orNull)
      .tags(tags.map(_.asJava).orNull)
      .includeMap(includeMap.orNull)
      .resourceTags(resourceTags.map(_.asJava).orNull)
      .build()
}
