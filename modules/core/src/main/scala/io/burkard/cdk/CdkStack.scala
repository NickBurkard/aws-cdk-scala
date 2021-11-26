package io.burkard.cdk

import software.amazon.awscdk.{App, Stack, StackProps}

/**
 * CDK stack.
 * @param id Optional stack ID.
 * @param props Optional stack properties.
 * @param appCtx CDK app context.
 */
abstract class CdkStack(
  id: Option[String] = None,
  props: Option[StackProps] = None
)(implicit
  appCtx: App
) extends Stack(appCtx, id.orNull, props.orNull)  {

  // Context for initializing stack resources.
  protected[this] implicit lazy val stackCtx: Stack = this
}

object CdkStack {

  /**
   * Create an anonymous instance of a custom stack.
   * @param id Optional stack ID.
   * @param props Optional stack properties.
   * @param resources Function for initializing stack resources.
   * @param appCtx CDK app context.
   * @tparam A Result of initializing stack resources.
   * @return CDK stack.
   */
  def apply[A](
    id: Option[String] = None,
    props: Option[StackProps] = None
  )(
    resources: Stack => A
  )(implicit appCtx: App): Stack =
    new CdkStack(id, props) { ValueDiscard[A](resources(stackCtx)) }
}