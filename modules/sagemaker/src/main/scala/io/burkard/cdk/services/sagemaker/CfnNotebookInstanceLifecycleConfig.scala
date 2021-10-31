package io.burkard.cdk.services.sagemaker

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnNotebookInstanceLifecycleConfig {

  def apply(
    internalResourceId: String,
    onCreate: Option[List[_]] = None,
    notebookInstanceLifecycleConfigName: Option[String] = None,
    onStart: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig =
    software.amazon.awscdk.services.sagemaker.CfnNotebookInstanceLifecycleConfig.Builder
      .create(stackCtx, internalResourceId)
      .onCreate(onCreate.map(_.asJava).orNull)
      .notebookInstanceLifecycleConfigName(notebookInstanceLifecycleConfigName.orNull)
      .onStart(onStart.map(_.asJava).orNull)
      .build()
}
