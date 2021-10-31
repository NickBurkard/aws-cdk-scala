package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OneDriveConfigurationProperty {

  def apply(
    disableLocalGroups: Option[Boolean] = None,
    fieldMappings: Option[List[_]] = None,
    secretArn: Option[String] = None,
    exclusionPatterns: Option[List[String]] = None,
    tenantDomain: Option[String] = None,
    inclusionPatterns: Option[List[String]] = None,
    oneDriveUsers: Option[software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveUsersProperty] = None
  ): software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty =
    (new software.amazon.awscdk.services.kendra.CfnDataSource.OneDriveConfigurationProperty.Builder)
      .disableLocalGroups(disableLocalGroups.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .fieldMappings(fieldMappings.map(_.asJava).orNull)
      .secretArn(secretArn.orNull)
      .exclusionPatterns(exclusionPatterns.map(_.asJava).orNull)
      .tenantDomain(tenantDomain.orNull)
      .inclusionPatterns(inclusionPatterns.map(_.asJava).orNull)
      .oneDriveUsers(oneDriveUsers.orNull)
      .build()
}
