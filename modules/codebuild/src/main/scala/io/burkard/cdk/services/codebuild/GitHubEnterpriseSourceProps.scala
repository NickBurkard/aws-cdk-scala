package io.burkard.cdk.services.codebuild

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GitHubEnterpriseSourceProps {

  def apply(
    reportBuildStatus: Option[Boolean] = None,
    identifier: Option[String] = None,
    httpsCloneUrl: Option[String] = None,
    webhookFilters: Option[List[_ <: software.amazon.awscdk.services.codebuild.FilterGroup]] = None,
    branchOrRef: Option[String] = None,
    ignoreSslErrors: Option[Boolean] = None,
    cloneDepth: Option[Number] = None,
    webhookTriggersBatchBuild: Option[Boolean] = None,
    webhook: Option[Boolean] = None,
    fetchSubmodules: Option[Boolean] = None
  ): software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps =
    (new software.amazon.awscdk.services.codebuild.GitHubEnterpriseSourceProps.Builder)
      .reportBuildStatus(reportBuildStatus.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .identifier(identifier.orNull)
      .httpsCloneUrl(httpsCloneUrl.orNull)
      .webhookFilters(webhookFilters.map(_.asJava).orNull)
      .branchOrRef(branchOrRef.orNull)
      .ignoreSslErrors(ignoreSslErrors.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .cloneDepth(cloneDepth.orNull)
      .webhookTriggersBatchBuild(webhookTriggersBatchBuild.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .webhook(webhook.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .fetchSubmodules(fetchSubmodules.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}
